package gxt.visual.interfaces;

import gxt.visual.interfaces.presenter.IFileUploadFieldPresenter;
import gxt.visual.interfaces.view.IFileUploadFieldView;

import com.extjs.gxt.ui.client.widget.form.FileUploadField;

/**
 * @author eugenp
 */
public interface IFileUploadField extends ITextField< String >, IFileUploadFieldPresenter, IFileUploadFieldView{
	
	/** mine */
	FileUploadField getComponent();

}
