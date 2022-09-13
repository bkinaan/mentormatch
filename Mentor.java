public class Mentor {
    private String name;
    private boolean me;
    private boolean mm;
    private boolean te;
    private boolean wm;
    private int count;

    public Mentor(String name, boolean me, boolean mm, boolean te, boolean wm, int count) {
        this.name = name;
        this.me = me;
        this.mm = mm;
        this.te = te;
        this.wm = wm;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public boolean isMe() {
        return me;
    }

    public boolean isMm() {
        return mm;
    }

    public boolean isTe() {
        return te;
    }

    public boolean isWm() {
        return wm;
    }

    public int getCount() {
        return count;
    }
}