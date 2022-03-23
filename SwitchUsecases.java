public class SwitchUsecases {
    public static void main(String[] args) {

        //Switch Logic Assignment: RBAC
        String key="admin1";
        switch (key.toLowerCase().trim()){
            case "admin":
                System.out.println("Admin Account!");
                break;
            case "customer":
                System.out.println("Customer Account!");
                break;
            case "seller":
                System.out.println("Seller Account!");
                break;
            case "vendor":
                System.out.println("Vendor Account!");
                break;
            case "distributor":
                System.out.println("Distributor Account!");
                break;
            default:
                System.out.println("User Role Not Found!");

        }

        //Switch Logic Assignment: Environments
        String env="qa";
        switch (env.toLowerCase().trim()){
            case "prod":
                System.out.println("Prod Box!");
                break;
            case "dev":
                System.out.println("Dev Box!");
                break;
            case "stage":
                System.out.println("Staging Box!");
                break;
            case "qa":
                System.out.println("QA Box!");
                break;
            default:
                System.out.println("Environment Doesn't Match!");

        }
    }
}
