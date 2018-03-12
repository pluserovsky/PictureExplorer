/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_filemanagerwithimageseditor;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luk
 */
@XmlRootElement(name = "itemsList")
public class FoldersList {

    private List<Folder> foldersList = new ArrayList<>();

    public void add(Folder name) {
        this.foldersList.add(name);
    }

    public void remove(Folder name) {
        this.foldersList.remove(name);
    }

    public Folder getItem(int id) {
        for (int i = 0; i < foldersList.size(); i++) {
            if (foldersList.get(i).getId() == id) {
                return foldersList.get(i);
            }
        }
        return null;
    }

    @XmlElements(
            @XmlElement(name = "item"))
    public List<Folder> getFoldersList() {
        return foldersList;
    }

    public void setFoldersList(List<Folder> foldersList) {
        this.foldersList = foldersList;
    }

}
