package gxt.visual.ui.client.interfaces;

import com.extjs.gxt.ui.client.widget.ColorPalette;

import gxt.visual.ui.client.interfaces.presenter.IColorPalettePresenter;
import gxt.visual.ui.client.interfaces.view.IColorPaletteView;

/**
 * @author eugenp
 */
public interface IColorPalette extends IComponent, IColorPaletteView, IColorPalettePresenter{
	
	/** mine */
	ColorPalette getComponent();

}
