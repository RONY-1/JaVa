public class Person1 {
        private String name;
        private int id;

        public Person1 (String name, int id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public static void main(String[] args) {
            Person1 student = new Person1("Md.Rony", 221_15_4967);
            System.out.println("Name :" + student.getName());
            System.out.println("ID :" + student.getId());
        }

    }
