package com.me.ultimatemathadventures;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;

class UltimateMathAdventures extends Game {
	
	SpriteBatch batch;
	BitmapFont font; 
	
	
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
	}

	public void render() {
		super.render();
		
		
		
	}
	
	public void dispose() {
		batch.dispose();
		font.dispose();
		
	}
}

class MainMenuScreen implements Screen {

    final UltimateMathAdventures game;

    OrthographicCamera camera;

    public MainMenuScreen(final UltimateMathAdventures gam) {
            game = gam;

            camera = new OrthographicCamera();
            camera.setToOrtho(false, 800, 480);

    }

	@Override
	public void render(float delta) {
		
		 Gdx.gl.glClearColor(0, 0, 0.2f, 1);                 
		 Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);                  
		 camera.update();                 
		 game.batch.setProjectionMatrix(camera.combined);                  
		 game.batch.begin();                 
         game.batch.end();                  
         if (Gdx.input.isTouched()) {                         
         game.setScreen(new UlimateMathAdventures(game));                         
         dispose();                 } 
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}


    //...Rest of class omitted for succinctness.

}


 public class UlimateMathAdventures implements Screen {
	final UltimateMathAdventures game;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
    Rectangle DarkNinja; 
    Texture Character; 
	Texture mainmenu; 
    
    
	public UlimateMathAdventures(final UltimateMathAdventures gam) {
 this.game  = gam;
		
		Character = new Texture(Gdx.files.internal("DarkNinja.png")); 

		   camera = new OrthographicCamera();
		   camera.setToOrtho(false, 800, 480);
		   batch = new SpriteBatch();
		
		
	
		DarkNinja = new Rectangle();    
		DarkNinja.x = 800 / 2 - 64 / 2;   
		DarkNinja.y = 20;    
		DarkNinja.width = 64;    
		DarkNinja.height = 64;

	
	}

	
	
	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render(float delta) {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		   camera.update();
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(Character, DarkNinja.x, DarkNinja.y); 
		batch.end();
		
		  if(Gdx.input.isKeyPressed(Keys.LEFT)) DarkNinja.x -= 200 * Gdx.graphics.getDeltaTime();    
		  if(Gdx.input.isKeyPressed(Keys.RIGHT)) DarkNinja.x += 200 * Gdx.graphics.getDeltaTime();
	
		   if(DarkNinja.x < 0) DarkNinja.x = 0;    
		   if(DarkNinja.x > 800 - 64) DarkNinja.x = 800 - 64;
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
	
	@Override
	public void hide() {
	}



	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
}
	
