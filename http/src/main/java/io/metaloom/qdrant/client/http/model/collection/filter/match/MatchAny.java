package io.metaloom.qdrant.client.http.model.collection.filter.match;

import java.util.List;

public class MatchAny implements Match {

	private List<Object> any;

	public List<Object> getAny() {
		return any;
	}

	public MatchAny setAny(List<Object> any) {
		this.any = any;
		return this;
	}

}
