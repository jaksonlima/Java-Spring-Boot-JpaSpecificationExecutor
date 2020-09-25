package jpa.data.specification.repository.search;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemCriteria {
	
	private int page = 0;

	private int size = 25;

	private List<String> filter;

	public List<String> getFilter() {
		if(filter == null && filter.isEmpty()){
			filter = new ArrayList<>();

			filter.add("arg0");
		}
		return filter;
	}

}