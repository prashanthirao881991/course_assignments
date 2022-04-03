public class ClassObjectSwitchCase {

    public String[] getEmployeeDevices(String empName) {
        System.out.println("Employee Name is: " + empName);
        String devices[] = new String[5];
        switch (empName.toLowerCase().trim()) {
            case "radhika":
                devices[0] = "iPhone 13";
                devices[1] = "Macbook";
                devices[2] = "Airpods";
                break;

            case "ramya":
                devices[0] = "Dell Monitor";
                devices[1] = "Samsung Phone";
                devices[2] = "Samsung Buds";
                devices[3] = "Dell Laptop";
                devices[4] = "Tab";
                break;

            case "rajesh":
                devices[0] = "OnePlus 6 Phone";
                devices[1] = "HP Laptop";
                break;

            default:
                System.out.println("Employee Name " + empName + " Not Found!");
                break;
        }
        return devices;
    }

    public static void main(String[] args) {
        String name = "Ramya";
        ClassObjectSwitchCase co = new ClassObjectSwitchCase();
        String[] devicesList = co.getEmployeeDevices(name);
        System.out.println("Number of Devices of " + name + ": " + devicesList.length);
        System.out.println("List of Devices: ");
        for (String device : devicesList) {
            System.out.println(device);
        }

    }
}
