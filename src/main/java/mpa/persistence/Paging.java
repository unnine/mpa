package mpa.persistence;

public class Paging {

    private int offset;

    private int limit;


    public Paging(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }


    public int offset() {
        return offset;
    }

    public int limit() {
        return limit;
    }
}
