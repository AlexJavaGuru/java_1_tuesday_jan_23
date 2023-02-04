package student_dmitry_kupcus.lesson_3.level_4;

class Phone {

    String model;

    Phone (String getModel) {
        model = getModel;
    }

    void Book (String newModel) {
            model = newModel;

        }
    String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }
