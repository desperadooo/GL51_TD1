package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureResizeService
import gl51.service.ThumbnailService
import gl51.service.UploadToCloudService
import gl51.service.WaterMarkService

import javax.inject.Inject;

class UploadToCloudServiceImpl implements UploadToCloudService {
    @Inject ThumbnailService thumbnailService
    @Inject PictureResizeService pictureResizeService

    @Override
    boolean upload() {
        Picture pic, thumbnail;
        pic = pictureResizeService.resizePicture(1024, 1024);
        thumbnail = thumbnailService.generateThumbnail();
        return true;
    }
}
