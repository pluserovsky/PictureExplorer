/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_filemanagerwithimageseditor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "item")
public class Folder {

    private String path;
    private String name;   
    private int id;

    public Folder() {

    }

    public Folder(int id, String path, String name) {
        this.id = id;
        this.path = path;
        this.name = name;
    }

    @XmlAttribute(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute(name = "picPath")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @XmlAttribute(name = "name")
    public String getItem() {
        return name;
    }

    public void setItem(String item) {
        this.name = item;
    }

}
