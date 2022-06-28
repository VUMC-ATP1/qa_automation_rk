import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {

        @Test
        public void employeeNameTest() {
            Employee emp = new Employee();
            emp.setName("Zigismunds");
            Assert.assertEquals(emp.getName(), "Zigismunds");
        }
        @Test
        public void employeeSurnameTest() {
            Employee emp = new Employee();
            emp.setSurname("Jaukais");
            Assert.assertEquals(emp.getSurname(), "Jaukais");
        }
    @Test
    public void employeeRoleTest() {
        Employee emp = new Employee();
        emp.setRole("Menedžeris");
        Assert.assertEquals(emp.getRole(), "Menedžeris");
    }
    @Test
    public void employeeYearTest() {
        Employee emp = new Employee();
        emp.setYear(35);
        Assert.assertEquals(emp.getYear(), 35);
    }
    }

