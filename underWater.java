import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class underWater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class underWater extends World
{

    /**
     * Constructor for objects of class underWater.
     * 
     */
    public underWater()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        prepare();
    }
    
    private void prepare()
    {
        yellowSubmarine yellowSubmarine = new yellowSubmarine();
        addObject(yellowSubmarine, 300, 120);
        
        coral coral1 = new coral();
        addObject(coral1, 75, 790);
        
        coral coral2 = new coral();
        addObject(coral2, 225, 790);
        
        groupBeatles group = new groupBeatles();
        addObject(group, 55, 732);
        
        eachBeatle single = new eachBeatle();
        addObject(single, 133, 741);
    }
}
