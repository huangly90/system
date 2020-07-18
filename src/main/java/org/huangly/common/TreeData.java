package org.huangly.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

import java.util.List;

public abstract class TreeData {

    @Transient
    @Setter @Getter
    List<TreeData> children;

    @JsonIgnore
    public abstract String getpk();
    @JsonIgnore
    public abstract String getParentPk();

    public List<TreeData> getChildren() {
        return children;
    }

    public void setChildren(List<TreeData> children) {
        this.children = children;
    }

}
