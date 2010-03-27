package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.ColorPalette;
import gxt.client.visual.interfaces.presenter.IColorPalettePresenter;
import gxt.client.visual.interfaces.view.IColorPaletteView;

/**
 * @author eugenp
 */
public interface IColorPalette extends IComponent, IColorPaletteView, IColorPalettePresenter{
	
	/** mine */
	ColorPalette getComponent();

}
