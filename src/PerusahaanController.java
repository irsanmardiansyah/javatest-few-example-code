import java.util.*;

public class PerusahaanController {

    void hitungListrik() {
        List<Map<String, String>> listCustomer = new ArrayList<>();
        Map<String, String> customerOne = new HashMap<>();
        customerOne.put("no", "1A");
        customerOne.put("name", "Irsan");
        customerOne.put("watt", "100");
        listCustomer.add(customerOne);

        Map<String, String> customerTwo = new HashMap<>();
        customerTwo.put("no", "1B");
        customerTwo.put("name", "Laura");
        customerTwo.put("watt", "200");
        listCustomer.add(customerTwo);

        String inputNoCustomer;
        int total;
        System.out.println("Input No Customer: ");
        Scanner input = new Scanner(System.in);
        inputNoCustomer = input.nextLine();

        Map<String, String> map;

        for (int j = 0; j < listCustomer.size(); j++)
        {
            map = listCustomer.get(j);
            String noCustomer = map.get("no");
            if (noCustomer.equals(inputNoCustomer)) {
                int watt = Integer.parseInt(map.get("watt"));
                int initWatt = 100;
                if (watt > initWatt) {
                    int extraWatt = watt - initWatt;
                    total = initWatt * 1500;
                    total += extraWatt * 1200;
                } else {
                    total = watt * 1500;
                }
                System.out.println("Total biaya yang harus dibayar sebesar Rp" + total + ",00");
                break;
            }
        }
    }
}