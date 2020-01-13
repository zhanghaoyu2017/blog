package top.hiasenna.community.dto;

import lombok.Data;
import top.hiasenna.community.model.Question;

import javax.swing.table.TableRowSorter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PaginationDTO
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/1/1021:24
 * @Version 1.0
 **/
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPreviousPage;
    private boolean showNextPage;
    private boolean showFirstPage;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }
        //是否展示上一页,下一页
        if (page == 1) {
            showPreviousPage = false;
        } else {
            showPreviousPage = true;
        }
        if (page == totalPage) {
            showNextPage = false;
        } else {
            showNextPage = true;
        }
        //是否展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }
        //是否展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
