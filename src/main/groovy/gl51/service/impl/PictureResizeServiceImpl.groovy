package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureResizeService
import gl51.service.PictureThumnailService
import gl51.service.PictureUpdateService
import gl51.service.PictureUploadService
import gl51.service.PictureWatermarkService



import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PictureResizeServiceImpl implements PictureResizeService {

    @Inject
    PictureResizeService pictureResizeService

    @Inject
    PictureFetchService pictureFetchService

    @Inject
    PictureThumnailService pictureThumnailService

    @Inject
    PictureUpdateService pictureUpdateService

    @Inject
    PictureUploadService pictureUploadService

    @Inject
    PictureWatermarkService pictureWatermarkService

    @Override
    Picture resize(){
        Picture p = PictureFetchService.fetchPicture()
        p.height(1024)
        p.width(1024)
        return p
    }

}
