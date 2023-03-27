package cn.gov.yrcc.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class JobPosition implements Serializable {
    @ApiModelProperty(value = "职位唯一标识符")
    private Integer id;

    @ApiModelProperty(value = "职位名称")
    private String title;

    @ApiModelProperty(value = "左边界值")
    private Integer lft;

    @ApiModelProperty(value = "右边界值")
    private Integer rgt;

    @ApiModelProperty(value = "职位所在部门")
    private Integer departmentId;

    @ApiModelProperty(value = "职位所在地点")
    private String location;

    @ApiModelProperty(value = "职位描述")
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getRgt() {
        return rgt;
    }

    public void setRgt(Integer rgt) {
        this.rgt = rgt;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", lft=").append(lft);
        sb.append(", rgt=").append(rgt);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", location=").append(location);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}