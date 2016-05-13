package uk.co.kablammosoftware.tutorials.libgdx.texturepacker;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class TexturePackerRunner {

  public static void main(String[] args) {
    TexturePacker.process("assets", "build/output", "textures");
  }

}
