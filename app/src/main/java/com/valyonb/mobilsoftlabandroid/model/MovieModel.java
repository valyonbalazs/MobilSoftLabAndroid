package com.valyonb.mobilsoftlabandroid.model;

/**
 * Created by valyonbalazs on 20/04/16.
 */
import java.util.Objects;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;


//@ApiModel(description = "")
public class MovieModel   {

    @SerializedName("movieFragmentType")
    private String movieFragmentType = null;

    @SerializedName("externalMovieId")
    private Long externalMovieId = null;

    @SerializedName("movieTitle")
    private String movieTitle = null;

    @SerializedName("movieShortDescription")
    private String movieShortDescription = null;

    @SerializedName("movieLongDescription")
    private String movieLongDescription = null;

    @SerializedName("movieRating")
    private Long movieRating = null;

    @SerializedName("imdbUrl")
    private String imdbUrl = null;

    @SerializedName("trailerUrl")
    private String trailerUrl = null;



    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public String getMovieFragmentType() {
        return movieFragmentType;
    }
    public void setMovieFragmentType(String movieFragmentType) {
        this.movieFragmentType = movieFragmentType;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public Long getExternalMovieId() {
        return externalMovieId;
    }
    public void setExternalMovieId(Long externalMovieId) {
        this.externalMovieId = externalMovieId;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public String getMovieShortDescription() {
        return movieShortDescription;
    }
    public void setMovieShortDescription(String movieShortDescription) {
        this.movieShortDescription = movieShortDescription;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public String getMovieLongDescription() {
        return movieLongDescription;
    }
    public void setMovieLongDescription(String movieLongDescription) {
        this.movieLongDescription = movieLongDescription;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public Long getMovieRating() {
        return movieRating;
    }
    public void setMovieRating(Long movieRating) {
        this.movieRating = movieRating;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public String getImdbUrl() {
        return imdbUrl;
    }
    public void setImdbUrl(String imdbUrl) {
        this.imdbUrl = imdbUrl;
    }


    /**
     **/
    //@ApiModelProperty(required = true, value = "")
    public String getTrailerUrl() {
        return trailerUrl;
    }
    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MovieModel movie = (MovieModel) o;
        return Objects.equals(movieFragmentType, movie.movieFragmentType) &&
                Objects.equals(externalMovieId, movie.externalMovieId) &&
                Objects.equals(movieTitle, movie.movieTitle) &&
                Objects.equals(movieShortDescription, movie.movieShortDescription) &&
                Objects.equals(movieLongDescription, movie.movieLongDescription) &&
                Objects.equals(movieRating, movie.movieRating) &&
                Objects.equals(imdbUrl, movie.imdbUrl) &&
                Objects.equals(trailerUrl, movie.trailerUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieFragmentType, externalMovieId, movieTitle, movieShortDescription, movieLongDescription, movieRating, imdbUrl, trailerUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Movie {\n");

        sb.append("    movieFragmentType: ").append(toIndentedString(movieFragmentType)).append("\n");
        sb.append("    externalMovieId: ").append(toIndentedString(externalMovieId)).append("\n");
        sb.append("    movieTitle: ").append(toIndentedString(movieTitle)).append("\n");
        sb.append("    movieShortDescription: ").append(toIndentedString(movieShortDescription)).append("\n");
        sb.append("    movieLongDescription: ").append(toIndentedString(movieLongDescription)).append("\n");
        sb.append("    movieRating: ").append(toIndentedString(movieRating)).append("\n");
        sb.append("    imdbUrl: ").append(toIndentedString(imdbUrl)).append("\n");
        sb.append("    trailerUrl: ").append(toIndentedString(trailerUrl)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
