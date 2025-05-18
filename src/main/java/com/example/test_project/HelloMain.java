package com.example.test_project;


public class HelloMain {

    public static void main(String[] args) {
























////
////        int i = 10;
////        System.out.println(i);
////        increment(i);
////        System.out.println(i);
//
//        Counter c = new Counter(10);
//        System.out.println(c.value); // Prints 10
//        increment2(c);
//        System.out.println(c.value);
//
//        String ss = "Hello {}";
//        String name = "Alice";
//        String resultt = ss.replace("{}", name);
//        System.out.println(ss.replace("{}", name)); // Ou
//
//
//        String string = "Hi How are you Hi Hi How are you How";
//
//        String s = "12 34564678 2345 6789 3456 6895";
//        String s2 = "12 34564678 2345 6789 3456 6892";
//        String s3 = "12 34564678 2345 6789 3456 6896";
//
//        List<String> list = new ArrayList<>();
//        list.add(s);
//        list.add(s2);
//        list.add(s3);
//        Collections.sort(list);
//
//        System.out.println(list);
//
//        //return dup words
//        //return Highest repeated word
//        //remove dup words
//
//        Arrays.stream(string.split(" ")).collect(Collectors.collectingAndThen(
//                Collectors.groupingBy(Function.identity(), Collectors.counting()),
//                stringLongMap -> {
//                    long max = stringLongMap.values().stream().mapToLong(value -> value).max().orElse(0);
//                    return stringLongMap.entrySet()
//                            .stream().filter(stringLongEntry -> stringLongEntry.getValue() == max)
//                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//                }
//        ));
//
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", 5000),
//                new Employee("Bob", 3000),
//                new Employee("Charlie", 4000),
//                new Employee("David", 5000),
//                new Employee("Eve", 4000)
//        );
//
//        employees.stream()
//                .collect(Collectors.groupingBy(
//                        Employee::getSalary,
//                        () -> new TreeMap<>(Comparator.reverseOrder()),
//                        Collectors.mapping(Employee::getName, Collectors.toList())
//                ))
//                .entrySet().stream()
//                .skip(1)
//                .findFirst().ifPresent(result -> System.out.println(result.getKey() + " -- " + result.getValue()));

    }

    private static void increment(int i) {
        i++;
    }

    static void increment2(Counter counter) {
        //counter.value++; // Modifies the object's state
        counter = new Counter(20);
    }

    static class Employee {
        String name;
        int salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public String toString() {
            return name + " - " + salary;
        }
    }

    static class Counter {
        int value;
        Counter(int value) {
            this.value = value;
        }
    }
}
