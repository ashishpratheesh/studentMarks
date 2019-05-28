package sample;

import org.joda.time.DateTime;

import java.util.Arrays;
import java.util.Date;

public class Student
{
     private int studentId;
     private String firstename;
     private String lastname;
     private String gender;
     private DateTime birthDate;
     private float mnarks[];
     private float totalMarks;
     private float percentage;
     private String result;

    public Student() {
    }

    public Student(int studentId, String firstename, String lastname, String gender, DateTime birthDate, float[] mnarks) {
        this.studentId = studentId;
        this.firstename = firstename;
        this.lastname = lastname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mnarks = mnarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstename(String firstename) {
        return firstename;
    }

    public void setFirstename(String firstename) {
        this.firstename = firstename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate)
    {
        this.birthDate = birthDate;
    }

    public float[] getMnarks() {
        return mnarks;
    }

    public void setMnarks(float[] mnarks) {
        this.mnarks = mnarks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }


    public String getResult()
    {
        return result;
    }
    void  calculatetotal()
    {
        this.totalMarks = 0.0f;

        for (int i = 0; i < mnarks.length; i++)
        {
          this.totalMarks = this.totalMarks + mnarks[i];

        }
    }
        void calculatePercentage ()
        {

            this.percentage = this.totalMarks / this.mnarks.length;
        }


        void calculateResult ()
        {
          int passed=0;

        for(int i=0;i<mnarks.length;i++)
        {
            if (mnarks[i]>50.0f);
            {
                passed++;
            }
            if (passed<=2)
            {
                this.result= "fail";
            }
            else
            {
                if(this.percentage>=94.0f)
                {
                    this.result="A+";
                }



             else if (this.percentage>=87.0f)
                    {
                        this.result="A";
                    }


           else if(this.percentage>=80.0f)
            {
                this.result="A-";
            }

           else if(this.percentage>=77.0f)
             {
            this.result = "B+";
             }

            else  if(this.percentage>=73.0f)
            {
                this.result="B";
            }

          else if(this.percentage>=70.0f)
            {
                this.result="B-";
            }


           else if(this.percentage>=67.0f)
            {
                this.result="C+";
            }


           else if(this.percentage>=63.0f)
            {
                this.result="C";
            }


           else if(this.percentage>=60.0f)

            {
                this.result="C-";
            }

        }
        }


        }

    public void dispaly()
    {
        System.out.println( "student id "+getStudentId());

        System.out.println( "name "+getFirstename("jack"));;
        System.out.println( "subject "+getMnarks());
        System.out.println( "total marks "+getTotalMarks());
        System.out.println( "percentage "+getPercentage());
        System.out.println( "result "+getResult()
       );



    }

    @Override
        public String toString () {
            return "Student{" +
                    "studentId=" + studentId +
                    ", firstename='" + firstename + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", gender='" + gender + '\'' +
                    ", birthDate=" + birthDate +
                    ", mnarks=" + Arrays.toString(mnarks) +
                    ", totalMarks=" + totalMarks +
                    ", percentage=" + percentage +
                    ", result='" + result + '\'' +
                    '}';

        }
    }