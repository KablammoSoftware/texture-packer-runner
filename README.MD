# Texture Packer
This is a tiny utility project for wrapping up the libGDX TexturePacker, to make it easier to
create simple texture atlases for use with the libGDX framework.

## How to Use
Put your textures into the assets folder in the root of the project, then run the main class.
You can do this easily using the included gradle wrapper by running the command `./gradlew pack`.

This will create a `textures.pack` and `textures.atlas` in the `build/output` directory. This process
can take a long time when you have many images.

## More Information
Read more about the libGDX texture packer on the [libGDX Wiki](https://github.com/libgdx/libgdx/wiki/Texture-packer)

## Example
The standard project comes with a button.9.png file and a button-pressed.9.png file, which you can
use to test the tool.
