package nl.esciencecenter.ahn.pointcloud.resources;

import nl.esciencecenter.ahn.pointcloud.services.PointCloudStore;

public class AbstractResource {
    private final PointCloudStore store;

    public AbstractResource(PointCloudStore store) {
        this.store = store;
    }
}
