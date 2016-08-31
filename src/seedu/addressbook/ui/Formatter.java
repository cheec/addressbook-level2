package seedu.addressbook.ui;

import java.util.List;

public class Formatter {
    
    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();
    
    /**
     * Appends <code>end</code> strings to <code>toFormat</code>.
     * 
     * @param toFormat
     *            string to format
     * @param end
     *            end strings to append
     * @return
     */
    public static String beautifyEnds(String toFormat, String end) {
        return end + toFormat.replace("\n", LS + end);
    }
    
    /**
     * Formats a list of strings as a viewable indexed list.
     * 
     * @param items
     *            list to format
     * @param startIndex
     *            index to start from
     * @return list formatted as an indexed list
     */
    public static String asIndexedList(List<String> items, int startIndex) {
        final StringBuilder formatted = new StringBuilder();
        int i = startIndex;
        for (String listItem : items) {
            formatted.append(asIndexedListItem(i, listItem)).append("\n");
            i++;
        }
        return formatted.toString();
    }
    
    /**
     * Formats a string as a viewable indexed item.
     * 
     * @param visibleIndex
     *            index of item
     * @param listItem
     *            item to format
     * @return item formated with index
     */
    public static String asIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }
}
