package Homework4.Task1;

import Homework4.Task1.DataClass.Blooming;
import Homework4.Task1.DataClass.Plants;
import Homework4.Task1.DataClass.Smelling;
import Homework4.Task1.DataClass.Trees;

public class Runner {
    public static void main(String[] args) {

        Spruce spruce = new Spruce("Ель");
        Pine pine = new Pine("Сосна");
        Rose rose = new Rose("Роза");
        Fern fern = new Fern("Папоротник");

        Smelling[] canSmell = {spruce, pine, rose};
        for (Smelling smelling : canSmell) {
            if (smelling instanceof Trees) {
                Trees trees = (Trees) smelling;
                trees.doSmell(trees.getName());
            } else if (smelling instanceof Plants) {
                Plants plants = (Plants) smelling;
                plants.doSmell(plants.getName());
            }
        }


        Blooming[] canBloom = {rose, fern};
        for (Blooming blooming : canBloom) {
            if (blooming instanceof Plants) {
                Plants plants = (Plants) blooming;
                plants.doBloom(plants.getName());
            }
        }


    }
}
