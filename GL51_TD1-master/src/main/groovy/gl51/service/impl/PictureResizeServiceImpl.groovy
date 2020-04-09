package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureResizeService
import javax.inject.Inject

class PictureResizeServiceImpl implements PictureResizeService{
    @Inject PictureFetchService pictureFetchService

    @Override
    Picture resizePicture(int width, int height) {
        Picture pic = pictureFetchService.fetchPicture();
        pic.setWidth(width);
        pic.setHeight(height);
        return pic;
    }
}
