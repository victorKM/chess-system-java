package chess;

import boardgame.Position;

public class ChessPosition {
  
  private Character column;
  private Integer row;

  public ChessPosition(){
  }

  public ChessPosition(Character column, Integer row) {
    if (column < 'a' || column > 'h' || row < 1 ||  row > 8) {
      throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
    }

    this.column = column;
    this.row = row;
  }

  public Character getColumn() {
    return column;
  }

  public Integer getRow() {
    return row;
  }

  protected Position toPosition() {
    // matrix_row = 8 - chess_row
    // matrix_column = chess-column - 'a'

    return new Position(8 - row, column - 'a');
  }

  protected static ChessPosition fromPosition(Position position) {
    return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
  }

  @Override
  public String toString() {
    return "" + column + row;
  }
}
