package boardgame;

public class Board {

    private Integer rows;
    private Integer column;
    private Piece[][] pieces;

    public Board(){
    }

    public Board(Integer rows, Integer column) {
      this.rows = rows;
      this.column = column;
      pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
      return rows;
    }

    public void setRows(Integer rows) {
      this.rows = rows;
    }

    public Integer getColumn() {
      return column;
    }

    public void setColumn(Integer column) {
      this.column = column;
    }
    
}
