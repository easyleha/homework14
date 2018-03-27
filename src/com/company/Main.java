package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Smartphone> phoneList = new ArrayList<>();
        phoneList.add(new Smartphone("IPhone7", 18000, 2017, 1800, Manufacturer.iphone ));
        phoneList.add(new Smartphone("Samsung S5", 5000, 2016, 2100, Manufacturer.samsung ));
        phoneList.add(new Smartphone("Lenovo ZUK Z1", 4399, 2016, 4100, Manufacturer.lenovo ));

        Collections.sort(phoneList, new Comparator<Smartphone>() {
            @Override
            public int compare(Smartphone o1, Smartphone o2) {
                return Integer.compare(o1.getBatteryCapacity(), o2.getBatteryCapacity());
              }
          });
        for (int i = 0; i < phoneList.size(); i++) {
            System.out.println(phoneList.get(i).toString());
        }
        System.out.println("==========================================");

        List <Monitor> monitorList = new ArrayList<>();
        monitorList.add(new Monitor("LG 27MP68VQ-P", 6699, 2017, 27, Manufacturer.LG ));
        monitorList.add(new Monitor("Samsung S24D300HS", 3399, 2016, 24, Manufacturer.samsung ));
        monitorList.add(new Monitor("Samsung Curved C24F396F", 5099, 2018, 23.5, Manufacturer.samsung ));

        Collections.sort(monitorList, new Comparator<Monitor>() {
            @Override
            public int compare(Monitor o1, Monitor o2) {
                return Double.compare(o1.getDiagonal(), o2.getDiagonal());
            }
        });
        for (int i = 0; i < monitorList.size(); i++) {
            System.out.println(monitorList.get(i).toString());
        }
        System.out.println("==========================================");

        List <Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("ASUS N55S", 10000, 2014, 6, Manufacturer.asus ));
        laptopList.add(new Laptop("Asus VivoBook Max X541NA", 7199, 2017, 4, Manufacturer.asus ));
        laptopList.add(new Laptop("Asus X751NV", 10807, 2017, 4, Manufacturer.asus ));

        Collections.sort(laptopList, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Double.compare(o1.getRam(), o2.getRam());
            }
        });
        for (int i = 0; i < laptopList.size(); i++) {
            System.out.println(laptopList.get(i).toString());
        }
        System.out.println("==========================================");

        List<PriceAndYear> assortmentList = new ArrayList<>();
            assortmentList.addAll(phoneList);
            assortmentList.addAll(monitorList);
            assortmentList.addAll(laptopList);

            System.out.println("The assortment of online store:");

        System.out.println();

        for (int i = 0; i<assortmentList.size();i++){
                System.out.println(assortmentList.get(i).toString());
        }

        System.out.println();
        System.out.println("How do you want to sort an assortment?");
        System.out.println("By price (press 1)");
        System.out.println("By price - inverse (press 2)");
        System.out.println("By date of manufacture (press 3)");
        System.out.println("By fabricator (press 4)");

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String inputString = input.readLine();

            if (Integer.parseInt(inputString) == 1) {
            Collections.sort(assortmentList, new Comparator<PriceAndYear>() {
                @Override
                public int compare(PriceAndYear o1, PriceAndYear o2) {
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
            });
            System.out.println("SORT BY PRICE");
            for (int i = 0; i < assortmentList.size(); i++) {
                System.out.println(assortmentList.get(i).toString());

            }
            } else if (Integer.parseInt(inputString) == 2) {
                Collections.sort(assortmentList, new Comparator<PriceAndYear>() {
                    @Override
                    public int compare(PriceAndYear o1, PriceAndYear o2) {
                        return Double.compare(o2.getPrice(), o1.getPrice());
                    }
                });
                System.out.println("SORT BY PRICE - INVERSE");

                for (int i = 0; i < assortmentList.size(); i++) {
                    System.out.println(assortmentList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 3) {
                Collections.sort(assortmentList, new Comparator<PriceAndYear>() {
                    @Override
                    public int compare(PriceAndYear o1, PriceAndYear o2) {
                        return Integer.compare(o1.getYearOfRelease(), o2.getYearOfRelease());
                    }
                });
                System.out.println("SORT BY DATE OF MANUFACTURE");
                for (int i = 0; i < assortmentList.size(); i++) {
                    System.out.println(assortmentList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 4) {
                System.out.println("Choose the manufacturer");
                System.out.println("Asus (press 1)");
                System.out.println("Lenovo (press 2)");
                System.out.println("Iphone (press 3)");
                System.out.println("Samsung (press 4)");
                System.out.println("LG (press 5)");
                String inputStringChoose = input.readLine();
                System.out.println("SORT BY MANUFACTURER");
                if (Integer.parseInt(inputStringChoose) == 1) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getManufacturer() == Manufacturer.asus) {
                            System.out.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 2) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getManufacturer() == Manufacturer.lenovo) {
                            System.out.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 3) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getManufacturer() == Manufacturer.iphone) {
                            System.out.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 4) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getManufacturer() == Manufacturer.samsung) {
                            System.out.println(assortmentList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 5) {
                    for (int i = 0; i < assortmentList.size(); i++) {
                        if (assortmentList.get(i).getManufacturer() == Manufacturer.LG) {
                            System.out.println(assortmentList.get(i));
                        }
                    }
                } else {
                    System.out.println("You did not make you choose.");
                }
            } else {
                System.out.println("You did not make you choose.");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("You did not make you choose.");
        }
    }
}
