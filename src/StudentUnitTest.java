public class StudentTUnitTest {
        private Student student;

        @BeforeEach
        void setUp() {
            student = new Student("John Doe", 20, "S123456", "john@example.com");
        }

        @Test
        void testConstructorInitialValues() {
            assertEquals("John Doe", student.getName());
            assertEquals(20, student.getAge());
            assertEquals("S123456", student.getStudentNumber());
            assertEquals("john@example.com", student.getEmail());
            assertEquals("Adult Student", student.getType());
            assertFalse(student.isEligibleForScholarship());
        }

        @Test
        void testSetAndGetGrade_Valid() {
            student.setGrade(88.5);
            assertEquals(88.5, student.getGrade());
        }

        @Test
        void testSetAndGetGrade_Invalid() {
            student.setGrade(150);
            assertNotEquals(150, student.getGrade()); // Should remain default 0.0
        }

        @Test
        void testSetAttendance() {
            student.setAttendance(85.0);
            assertEquals(85.0, student.getAttendance());
        }

        @Test
        void testCheckScholarshipEligibility_True() {
            student.setGrade(95.0);
            student.setAttendance(95.0);
            student.checkScholarshipEligibility();
            assertTrue(student.isEligibleForScholarship());
        }

        @Test
        void testCheckScholarshipEligibility_False_LowGrade() {
            student.setGrade(85.0);
            student.setAttendance(95.0);
            student.checkScholarshipEligibility();
            assertFalse(student.isEligibleForScholarship());
        }

        @Test
        void testCheckScholarshipEligibility_False_LowAttendance() {
            student.setGrade(95.0);
            student.setAttendance(85.0);
            student.checkScholarshipEligibility();
            assertFalse(student.isEligibleForScholarship());
        }

        @Test
        void testDetermineAgeGroup_YoungStudent() {
            student.setAge(16);
            assertEquals("Young Student", student.getType());
        }

        @Test
        void testDetermineAgeGroup_AdultStudent() {
            student.setAge(30);
            assertEquals("Adult Student", student.getType());
        }

        @Test
        void testDetermineAgeGroup_Pensioner() {
            student.setAge(70);
            assertEquals("Pensioner", student.getType());
        }
    }

