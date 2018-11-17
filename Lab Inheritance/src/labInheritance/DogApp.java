package labInheritance;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        mySledDog.pullSled();
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);
        
        ServiceDog myServiceDog = new ServiceDog("Great Dane");
        System.out.println(myServiceDog);
        actAsDog(myServiceDog);
        
        SeeingEyeDog mySeeingEyeDog = new SeeingEyeDog("Golden Retriever");
        System.out.println(mySeeingEyeDog);
        mySeeingEyeDog.guide();
        actAsDog(mySeeingEyeDog);
        
        TherapyDog myTherapyDog = new TherapyDog("Chihuahua");
        System.out.println(myTherapyDog);
        myTherapyDog.comfort();
        actAsDog(myTherapyDog);
    }

    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
