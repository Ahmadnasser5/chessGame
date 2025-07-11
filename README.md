# chessGame
This project is a simple graphical representation of a chessboard built using Java Swing. It creates an 8x8 chessboard and populates it with chess piece icons to resemble the initial setup of a chess game. Each square alternates in color, mimicking a standard chessboard pattern.
Features
8x8 chessboard created with GridLayout.

Alternating tile colors (green and light yellow).

Chess pieces are placed in their correct starting positions.

Basic GUI window with JFrame and JPanel.

Icon-based representation of pieces using .png images.

Technologies Used
Java SE

Java Swing (JFrame, JPanel, JButton, GridLayout)

AWT for color handling

Folder Structure
AAAA.java: Main class that initializes the GUI.

Images: The folder should include the following image assets:

White_Rook.svg.png

White_Knight.svg.png

White_Bishop.svg.png

White_Queen.svg.png

White_King.svg.png

Chess_white.svg.png (white pawn)

Black_Rock.svg.png (black rook, possibly a typo)

Black_Kinght.svg.png (black knight, also possibly a typo)

Chess_hdt45.svg.png (black pawn)

How to Run
Make sure you have Java installed (JDK 8+).

Clone this repository.

Place all the image assets in the project root or correct relative path.

Compile and run the program:

bash
Copy
Edit
javac AAAA.java
java aaaa.AAAA
Notes
Some image file names like Black_Rock.svg.png and Black_Kinght.svg.png may be typos. They should likely be Black_Rook.svg.png and Black_Knight.svg.png.

Currently, this GUI is static — the chess pieces do not move.

The ActionListener is implemented but not yet used, paving the way for future interaction (e.g., selecting and moving pieces).
