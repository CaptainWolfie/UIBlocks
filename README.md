# UIBlocks
A java library for easy-to-use and good Squared-Blocks with effects, custom colours and events.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Installing

A step by step series of examples that tell you how to get a development env running

Download a copy of the library

You can download it as a [zip file](https://github.com/CaptainWolfie/UIBlocks/archive/master.zip) or copy it to your desktop using this link on you git bash
```https://github.com/CaptainWolfie/UIBlocks/archive/master.zip```

Use the **UIBlocks.jar** and put it in your project from your **Build Path (for Eclipse IDE)**

## Running the tests

### Initializing the Library

Before writing any code don't forget to initialize it so the library will know the window's sizes anytime

```
JFrame frame = new JFrame();
UIMain.init(frame);
```

### Creating a block

Create a square block with UIColor: GRAY at positions: x: 30 pixels y: 10 pixels and sizes: width: Half the window height: Full window - 20 pixels

```
UISquare square = UISquare.createSquare(UIColor.GRAY); // create a new Square object named square
square.setX(new UILocation(30); // set the square's location X to 30 pixels
square.setY(new UILocation(10); // set the square's location Y to 10 pixels
UIDimension squareSize = new UIDimension(.5f, 1f); // create a new UIDimension object
squareSize.extraHeight(-20); // add -20 pixels to the height
square.setSize(squareSize); // set the square's size to size's object dimensions
```

you can make the square rounded by adding one more parameter to the ```createSquare``` method
example:
```
UISquare square = UISquare.createSquare(UIColor.GRAY, 10);
```

### Adding effects to the square

You can add open and close effects to the square with the ```setEffect(UIEffects effect, int effectPixels, int speed)```
where the ```effect``` parameter is what effect you want, the ```effectPixels``` is how many pixels to move until stop the effect and ```speed``` is how many pixels per frame to move
In this example we will make to hide from the right to the left.

```
// previous code
square.setEffect(UIEffects.RIGHT_TO_LEFT, 30, 5);
```

#### Available effects

**LEFT_TO_RIGHT**, **RIGHT_TO_LEFT**, **TOP_TO_BOTTOM**, **BOTTOM_TO_TOP**

### Change square's visibility

You can change anytime the visibility so the effect can take place with just one function

```
// previous code
square.setVisible(boolean visible);
```

### Draw the squares

You don't have to render the squares one by one, do it with just one function

```
// previous code
UISquare.renderSquares(g); // g is a java.awt.Graphics object
```

### Update the squares

Update the squares with one function

```
// previous code
UISquare.updateSquares();
```

### Delete a square

It deletes the square object and removes it from the squares list

```
// previous code
UISquare.deleteSquare(square);
```

## Authors

* **Matt Zafeiriou** - *Initial work* - [CaptainWolfie](https://github.com/CaptainWolfie)

## License

This project is licensed under the GNU General Public License v3.0 - see the LICENSE file for details
