/*
    Names: Zakirye Luqman, Matiullah Jalal, Hawo Issa
    Course: TCSS 360
    Quarter: Winter 2023
 */
package Model;

import java.io.Serial;
import java.io.Serializable;

/**
 * Roo class represents a room in trivia maze.
 * Room implements RoomInterface and Serializable.
 * Each room may have trivia questions.
 * Serializable will help to save and load an object.
 */
public class Room implements Serializable {
    /** A special number used when saving and loading objects.*/
    @Serial
    private static final long serialVersionUID = -89283998989899829L;
    /** Holds current door.*/
    private Door myDoor;
    /** Holds current x-coordinate.*/
    private int myX;
    /** Holds current y-coordinate.*/
    private int myY;
    /** Holds the letter associated with a room .*/
    private char myRoomLetter;
    /** Holds question and answer associated with a room.*/
    private QuestionAnswer1 myQA;

    /**
     * Constructor initializes the fields.
     * @param letter is the letter other letter associated with a room.
     * @param theX is the x-coordinate of the room.
     * @param theY is the y-coordinate of the room.
     * @param theDoor is the other door associated with the room.
     * @param theQA is the other question and answer associated with the room.
     */
    public Room(final char letter, final int theX, final int theY,
                final Door theDoor, final QuestionAnswer1 theQA) {
        myRoomLetter = letter;
        myX = theX;
        myY = theY;
        myDoor = theDoor;
        myQA = theQA;
    }
    /**
     * A getter to get question and answer.
     * @return returns question and answer associated with the room.
     */
    public QuestionAnswer1 getQuestionAnswer() {
        return myQA;
    }
    public void setQuestionAnswer(QuestionAnswer1 newQA) {
        myQA = newQA;
    }
    /**
     * A getter to get the question type.
     * @return returns the question type.
     */
    public String getCurrentQuestionType() {
        return myQA.getMyType();
    }
    /**
     * Checks if the player answered the question is correctly.
     * @param playerAnswer is the answer of the player.
     * @return returns ture if correct otherwise false.
     */
    public boolean isAnswerCorrect(String playerAnswer) {

        return myQA.getMyAnswer().equalsIgnoreCase(playerAnswer);
    }
    /**
     *  Add this method to lock the door if the answer is incorrect.
     */
    public void lockDoor() {
        myDoor.lock(true);
    }
    /**
     * Get the current status of X.
     */
    public int getMyX() {
        return myX;
    }
    /**
     * Get the current status of Y.
     */
    public int getMyY() {
        return myY;
    }
    /**
     * Getter to return the status of the door.
     * @return returns the door status if locked or not.
     */
    public Door getMyDoor() {
        return myDoor;
    }
    /**
     * A getter to get a room letter.
     * @return returns the letter associated with room.
     */
    public char getLetter() {
        return myRoomLetter;
    }
    /**
     * A getter to get a question.
     * @return returns a question associated with room.
     */
    public String getQuestion() {
        return myQA.getMyQuestion();
    }
}


