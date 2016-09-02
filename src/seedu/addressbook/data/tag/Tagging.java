package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.Person;

public class Tagging {
    
    private final static ArrayList<Tagging> ALL_TAGGING_CHANGES = new ArrayList<Tagging>();
    
    private final static String ADDED_PREFIX   = "+";
    private final static String DELETED_PREFIX = "-";
    
    private final static String MESSAGE_TAGGING_CHANGES = "%1$s %2$s %3$s" + System.lineSeparator();
    private final static String EXAMPLE_TAGGING_CHANGE  = "+ Jake Woo [friend]";
    
    private final Tag    tag;
    private final Person person;
    private boolean      isLive; // whether tagging is live or deleted
    
    public Tagging(Person person, Tag tag) {
        this.tag = tag;
        this.person = person;
        isLive = true;
        ALL_TAGGING_CHANGES.add(this);
        
        // Assume there are commands to add and remove tags to a person in the
        // address book. Commands to add tags would be executed here.
    }
    
    public static void deleteTagging(Tagging t) {
        if (t == null) {
            return;
        }
        Tagging deletedTagging = new Tagging(t.person, t.tag);
        deletedTagging.isLive = false;
        ALL_TAGGING_CHANGES.add(deletedTagging);
        
        // Assume there are commands to add and remove tags to a person in the
        // address book. Commands to remove tags would be executed here.
    }
    
    /**
     * Constructs printable list of tagging changes.
     * 
     * @return a list of all the tags added/deleted during the session.
     */
    public static String getPrintableListOfTaggingChanges() {
        final StringBuilder printableList = new StringBuilder();
        for (Tagging t : ALL_TAGGING_CHANGES) {
            printableList.append(getFormattedTaggingMessage(t));
        }
        return printableList.toString();
    }
    
    /**
     * Constructs formatted Tagging change message e.g.
     * {@link #EXAMPLE_TAGGING_CHANGE}
     */
    private static String getFormattedTaggingMessage(Tagging t) {
        final String prefix = t.isLive ? ADDED_PREFIX : DELETED_PREFIX;
        final String personName = t.getPerson().getName().toString();
        final String tagToPrint = t.getTag().toString();
        return String.format(MESSAGE_TAGGING_CHANGES, prefix, personName, tagToPrint);
    }
    
    public Person getPerson() {
        return person;
    }
    
    public Tag getTag() {
        return tag;
    }
    
    public boolean isLive() {
        return isLive;
    }
    
}
