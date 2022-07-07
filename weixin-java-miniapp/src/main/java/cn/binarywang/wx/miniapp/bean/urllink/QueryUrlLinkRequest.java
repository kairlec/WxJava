package cn.binarywang.wx.miniapp.bean.urllink;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : cyb
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryUrlLinkRequest implements Serializable {
  private static final long serialVersionUID = -5220064685659499243L;

  @SerializedName("url_link")
  private String urlLink;
}
