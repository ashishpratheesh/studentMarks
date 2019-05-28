package sample;


import org.joda.time.DateTime;

public class Result {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setFirstename("jack");
        s1.setLastname("sparrow");
        s1.setGender("male");
        DateTime mybirthdate = new DateTime(2012, 6, 2, 0, 0, 0);
        s1.setBirthDate(mybirthdate);


        float myMarks[] =
                {

                        90.0f,
                        90.5f,
                        94.0f,
                        97.0f,
                        90.0f,
                };
        s1.setMnarks(myMarks);
        Student studentArray[] = new Student[5];
        studentArray[0] = s1;
        studentArray[1] = s1;
        studentArray[2] = s1;
        studentArray[3] = s1;
        studentArray[4] = s1;

        for (Student s : studentArray)
        {
            s.calculatetotal();
            s.calculatePercentage();
            s.calculateResult();
            s.dispaly();
        }
    }

}