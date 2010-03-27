package gxt.client.visual.interfaces;

import com.extjs.gxt.ui.client.widget.grid.ColumnHeader;

import gxt.client.visual.interfaces.presenter.IColumnHeaderPresenter;
import gxt.client.visual.interfaces.view.IColumnHeaderView;

/**
 * @author eugenp
 */
public interface IColumnHeader extends IBoxComponent, IColumnHeaderView, IColumnHeaderPresenter{

	/** mine */
	ColumnHeader getComponent();

}
