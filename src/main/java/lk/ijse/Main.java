package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.Embend.FullName;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Vish","shan");
        Student student_1 = new Student(1,fullName,"Kalu");


        Session session = FactoryConfiguration.getInstance().getSession();
//open transaction
        Transaction transaction = session.beginTransaction();
        session.save(student_1);
        transaction.commit();
        session.close();

    }
}