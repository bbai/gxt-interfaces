package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.event.Observable;

/**
 * @author eugenp
 */
public interface IBindings extends Observable{
	
	void unbind();
	void bind( final ModelData model );

}
