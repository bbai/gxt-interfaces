package gxt.client.visual.interfaces;

import com.extjs.gxt.desktop.client.Shortcut;
import com.extjs.gxt.ui.client.widget.IconSupport;

import gxt.client.visual.interfaces.presenter.IShortcutPresenter;
import gxt.client.visual.interfaces.view.IShortcutView;

/**
 * @author eugenp
 */
public interface IShortcut extends IComponent, IShortcutView, IShortcutPresenter, IconSupport{
	
	/** mine */
	Shortcut getComponent();

}
