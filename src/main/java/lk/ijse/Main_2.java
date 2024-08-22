package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.entity.Food;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main_2 {
    public static void main(String[] args) {
/*
        Food food_1 = new Food(1," cake",1200);
*/
        Food food_1 = new Food(1,"lava cake",1200);
        Food food_2 = new Food(2,"Amand cake",1250);
        Food food_3 = new Food(3,"Cofee cake",1300);
        Food food_4 = new Food(4,"Chocolate cake",1100);
        Food food_5 = new Food(5,"Butter cake",1290);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

//    Save..................
        session.save(food_1);
        session.save(food_2);
        session.save(food_3);
        session.save(food_4);
        session.save(food_5);

//   Update...................
        session.update(food_1);


//        delete..................
        session.delete(food_1);



//      get.................................
        Food food = session.get(Food.class, 2);
        System.out.println(food.getFoodId()+","+food.getFoodName()+","+food.getFoodPrice());


        transaction.commit();
        session.close();
    }
}
