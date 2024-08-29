package boardgame;

public class Board {

    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(){
    }

    public Board(Integer rows, Integer columns) {
      this.rows = rows;
      this.columns = columns;
      pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
      return rows;
    }

    public void setRows(Integer rows) {
      this.rows = rows;
    }

    public Integer getColumn() {
      return columns;
    }

    public void setColumn(Integer column) {
      this.columns = column;
    }
    
}
