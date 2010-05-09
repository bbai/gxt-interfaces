package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.ColorPalette;

import gxt.visual.interfaces.presenter.IColorPalettePresenter;
import gxt.visual.interfaces.view.IColorPaletteView;

/**
 * @author eugenp
 */
public interface IColorPalette extends IComponent, IColorPaletteView, IColorPalettePresenter{
	
	/** mine */
	ColorPalette getComponent();

}
