//package com.db.grad.javaapi.service;
//
//import com.db.grad.javaapi.repository.DogsRepository;
//import com.db.grad.javaapi.repository.DogsRepositoryStub;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import com.db.grad.javaapi.model.Dog;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class DogHandlerTest {
//
//    private DogsRepository itsDogRepo = new DogsRepositoryStub();
//
//    @BeforeEach
//    public void makeSureRepoIsEmpty() {
//        itsDogRepo.deleteAll();
//    }
//
//    @Test
//    public void add_a_dog_return_number_of_dogs_in_repo_is_one() {
//        // arrange
//        DogHandler cut = new DogHandler(itsDogRepo);
//        Dog theDog = new Dog();
//        theDog.setName("Bruno");
//        cut.addDog(theDog);
//
//        int expectedResult = 1;
//
//        // act
//        long actualResult = cut.getNoOfDogs();
//
//        // assert
//        assertEquals(expectedResult, actualResult);
//    }
//
//    @Test
//    public void add_several_dogs_return_number_of_dogs_match_number_added() {
//        // arrange
//        DogHandler cut = new DogHandler(itsDogRepo);
//
//        addDogToCut("Bruno", cut);
//        addDogToCut("Charlie", cut);
//        addDogToCut("Duke", cut);
//
//        int expectedResult = 3;
//
//        // act
//        long actualResult = cut.getNoOfDogs();
//
//        // assert
//        assertEquals(expectedResult, actualResult);
//    }
//
//    private static void addDogToCut(String Duke, DogHandler cut) {
//        Dog thirdDog = new Dog();
//        thirdDog.setName(Duke);
//        cut.addDog(thirdDog);
//    }
//}
