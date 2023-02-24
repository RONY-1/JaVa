public class Room {
        int roomNo;
        String roomType;
        float roomArea;
        boolean acMachine;

        Room() {
            System.out.println("Hello");
        }

        Room(int roomNo, String roomType, float roomArea, boolean acMachine) {
            this.roomNo = roomNo;
            this.roomType = roomType;
            this.roomArea = roomArea;
            this.acMachine = acMachine;
        }

        void display() {
            System.out.println("Room No :" + roomNo);
            System.out.println("Room Type :" + roomType);
            System.out.println("Room Area :" + roomArea);
            System.out.println("AC Machine :" + acMachine);
        }

        public static void main(String[] args) {
            new Room();
            Room a1 = new Room(777, "YKSG2", 1000.0f, true);
            a1.display();
        }

    }
