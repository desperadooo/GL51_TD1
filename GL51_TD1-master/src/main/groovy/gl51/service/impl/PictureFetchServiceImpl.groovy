package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureFetchService

class PictureFetchServiceImpl implements PictureFetchService{

    @Override
    Picture fetchPicture() {
        Picture pic;

        if(pic)
             return pic;
        else
            return null;
    }
}
