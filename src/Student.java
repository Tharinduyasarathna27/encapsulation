public class Student {

    // privet and getter, setter - Type 1
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Member Class - Type 2
    class Marks {
         private int mark;

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }
    }

    //Inner Class Type-3
    public void generateResults(String result){

         class ReleaseResult{
                    public void getResult(){
                        System.out.println("According the marks your result is : " + result);
                    }
         }

         ReleaseResult releaseResult=new ReleaseResult();
         releaseResult.getResult();
    }

    //Anonymous class Type-4
    public void  generateStatus(String status) {

        new Object() {
            public void setStatus() {

                System.out.println("Student Final Status is : " + status);

            }
        }.setStatus();

    }

}
